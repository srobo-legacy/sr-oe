#!/bin/sh

RUNDIR=/tmp/sr

echo "start_robot.sh: Starting code" >> /tmp/myfaceisonfire

# Enter cgroup
/bin/echo $$ > /dev/cgroup/robot/tasks

# Move to directory where user key is mounted
cd $1

# Create .srobo so the IDE exporter thing can find the disk
touch .srobo

# Clean up old sessions
rm -rf $RUNDIR

# Unzip
mkdir $RUNDIR
unzip -q -o robot.zip -d $RUNDIR
# wait for the last process -- ensure that the unzip is complete
wait $!

# Setup some useful environment variables
export DISPLAY=:0.0

cd $RUNDIR

# Hack around zipfiles not storing permissions
chmod u+x run.py

# Pump logs onto the user key
exec ./run.py -l $1
