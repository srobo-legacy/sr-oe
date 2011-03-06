#!/bin/sh

LEVEL=$(runlevel | cut -d ' ' -f 2)

# Don't boot robot until we reach runlevel 5!
if test $LEVEL != 5; then
	echo "not at runlevel 5" >> /tmp/myfaceisonfire
	exit
fi

if test -e /mnt/user/robot.zip; then
	echo "user disk" >> /tmp/myfaceisonfire
else
	echo "no robot.zip" >> /tmp/myfaceisonfire
	exit
fi

# Already running?
if test -e /var/run/robot; then
	exit
fi

touch /var/run/robot

/etc/robot/start_robot.sh /mnt/user &
