#!/bin/bash
mkdir -p /var/log/aws-basics
if [ -f /var/log/aws-basics/application.log ]; then mv /var/log/aws-basics/application.log "/var/log/aws-basics/application.log.$(date +"%Y%m%d_%H%M%S")"; fi
touch /var/log/aws-basics/application.log

java -jar /opt/aws-basics/user0-aws-basics.jar 2> /dev/null > /dev/null < /dev/null &

tail -f /var/log/aws-basics/application.log | while read LOGLINE
do
    [[ "${LOGLINE}" == *"Tomcat started on port(s): 443 (https)"* ]] && pkill -P $$ tail
done
exit 0
