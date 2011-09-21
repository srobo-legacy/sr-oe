#!/bin/sh

echo "ponies" >> /tmp/myfaceisonfire

# Enter cgroup
/bin/echo $$ > /dev/cgroup/robot/tasks

# Move to directory where user key is mounted
cd $1

# Create .srobo so the IDE exporter thing can find the disk
touch .srobo

# Unzip
unzip -o robot.zip -d .robottmp
wait $!

# Setup some useful environmental variables
export DISPLAY=:0.0
export LD_LIBRARY_PATH=/mnt/user/.robottmp

# Enter .robottmp, launch
cd .robottmp
python ./run.py
