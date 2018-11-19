#!/bin/bash

# Stop server
lab_running=`pgrep -f aws-basics`
if [[ -n  $lab_running ]]; then
    pkill -f aws-basics
fi