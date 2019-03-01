#!/bin/bash
PID=$(cat ./.pid)
kill -9 $PID
echo "===$APP_NAME app is stopped!"
