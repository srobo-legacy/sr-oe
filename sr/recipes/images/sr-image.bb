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
	   python-pyserial \
	   sr-sshkey screen bzip2 xz \
	   startup-notification \
	   gstreamer gst-plugins-good gst-ffmpeg \
	   libusb libusb1 python-pyusb \
	   imagemagick"

IMAGE_INSTALL = "task-base-extended \
            ${ANGSTROM_EXTRA_INSTALL} \
            ${SPLASH} \
	    zlib iotop ipython \
	    python python-modules zile \
	    opencv-apps python-opencv \
	    kernel-module-uvcvideo \
	    xf86-input-evdev xf86-video-fbdev xterm \
	    xserver-xorg gtk+ roboscripts \
	    libwnck matchbox-wm \
	    python-pyyaml python-pycairo python-pygtk \
	    python-pyserial mtd-utils \
	    sr-sshkey screen bzip2 xz \
	    startup-notification \
	    gstreamer gst-plugins-good gst-ffmpeg \
	    libusb libusb1 python-pyusb \
	    imagemagick"

# Modules for usb-to-serial adapters
IMAGE_INSTALL += "kernel-module-usbserial kernel-module-cdc-acm \
	      kernel-module-pl2303 kernel-module-ftdi-sio \
	      kernel-module-ti-usb-3410-5052 kernel-module-ch341"

# Modules for wifi adapters
IMAGE_INSTALL += "kernel-module-rt73usb kernel-module-rt2500usb \
	      kernel-module-rt2x00usb kernel-module-rndis-wlan \
	      kernel-module-at76c50x-usb kernel-module-libertas \
	      kernel-module-rtl8187"

export IMAGE_BASENAME = "sr-image"
IMAGE_LINGUAS = ""

inherit image
