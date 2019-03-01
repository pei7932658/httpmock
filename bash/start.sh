#!/bin/bash
APP_NAME=$(cat ./app-name)
export JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF8
export FILE_SPLIT=txt
export FILE_ENCODIN=UTF-8
export ABSOLUTE_PATH=/data/httpmock/
nohup java \
	-server -Xms128m -Xmx1024m -Xmn128m \
	-XX:+UseConcMarkSweepGC -XX:+UseCMSCompactAtFullCollection -XX:CMSInitiatingOccupancyFraction=70 \
	-XX:+CMSParallelRemarkEnabled -XX:+CMSClassUnloadingEnabled -XX:SurvivorRatio=8 -XX:+DisableExplicitGC \
	-jar $APP_NAME >> system_out.log 2>&1 &
echo $!> ./.pid
echo "===$APP_NAME app started!"
