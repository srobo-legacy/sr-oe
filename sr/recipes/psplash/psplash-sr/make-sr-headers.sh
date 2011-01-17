#!/bin/bash

./make-image-header.sh sr.png POKY
mv sr-img.h psplash-poky-img.h

./make-image-header.sh sr-bar.png BAR
mv sr-bar-img.h psplash-bar-img.h
