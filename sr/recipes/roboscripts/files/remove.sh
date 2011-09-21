#!/bin/sh

test -e /var/run/robot || exit	# Non robot.zip disk removed

rm /var/run/robot

exec /etc/robot/kill_robot.sh
