IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

ANGSTROM_EXTRA_INSTALL ?= ""

BAD_RECOMMENDATIONS = "avahi-daemon avahi-autoipd"

# psplash-zap tells psplash when to quit
SPLASH = "psplash-sr psplash-zap"

DEPENDS = "task-base-extended \
           ${SPLASH} \
	   zlib iotop ipython \
	   python zile \
	   xf86-input-evdev xf86-video-fbdev xterm \
	   xserver-xorg gtk+ mtd-utils roboscripts \
	   libwnck matchbox-wm \
	   python-pyyaml python-pycairo python-pygtk \
	   sr-sshkey screen bzip2 xz"

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
	    sr-sshkey screen bzip2 xz"

export IMAGE_BASENAME = "sr-image"
IMAGE_LINGUAS = ""

inherit image
