#!/bin/sh

# First, setup cgroups

mkdir /dev/cgroup
mount -t cgroup cgroup /dev/cgroup
mkdir /dev/cgroup/robot

# /bin/echo 0 > /dev/cgroup/robot/cpuset.cpus
# /bin/echo 0 > /dev/cgroup/robot/cpuset.mems

# Start X.
Xorg > /dev/null 2> /dev/null &

# Check whether we need to start already
/etc/robot/insert.sh
