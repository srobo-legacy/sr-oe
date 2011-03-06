#!/bin/sh

# Initially this used the freezer facility to stop robot tasks from doing
# anything while we were busy SIGKILLing them, however, this doesn't appear
# to be present in Angstrom. Neither is it necessary, it seems.

# /bin/echo "FROZEN" > /dev/cgroup/robot/freezer.state

cat /dev/cgroup/robot/tasks | while read pid; do
	kill -9 $pid
done

# /bin/echo "THAWED" > /dev/cgroup/robot/freezer.state

# Bang
