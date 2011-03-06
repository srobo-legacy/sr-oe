#!/bin/sh

LEVEL=$(runlevel | cut -d ' ' -f 2)

if test -e /mnt/user/robot.zip; then
	exit	# Non robot.zip disk removed?
fi

rm /var/run/robot

exec /etc/robot/kill_robot.sh
