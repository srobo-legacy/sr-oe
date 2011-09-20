IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

ANGSTROM_EXTRA_INSTALL ?= ""

BAD_RECOMMENDATIONS = "avahi-daemon avahi-autoipd"

# psplash-zap tells psplash when to quit
SPLASH = "psplash-sr psplash-zap"

DEPENDS = "task-base-extended \
           ${SPLASH} \
	   zlib iotop ipython \
	   python zile \
	   c2py robovis \
	   xf86-input-evdev xf86-video-fbdev xterm \
	   xserver-xorg gtk+ mtd-utils roboscripts \
	   libwnck matchbox-wm \
	   python-pyyaml python-pycairo python-pygtk \
	   sr-sshkey"

# The following are intentionally left out of the install, as they're
# shipped in robot.zip:
# * c2py
# * robovis
IMAGE_INSTALL = "task-base-extended \
            ${ANGSTROM_EXTRA_INSTALL} \
            ${SPLASH} \
	    zlib iotop ipython \
	    python python-modules zile \
	    opencv-apps kernel-module-uvcvideo \
	    xf86-input-evdev xf86-video-fbdev xterm \
	    xserver-xorg gtk+ roboscripts \
	    libwnck matchbox-wm \
	    python-pyyaml python-pycairo python-pygtk \
	    sr-sshkey"

export IMAGE_BASENAME = "sr-image"
IMAGE_LINGUAS = ""

inherit image
