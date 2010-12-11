IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

ANGSTROM_EXTRA_INSTALL ?= ""

SPLASH ?= ""
ZZAPSPLASH = ' ${@base_contains("MACHINE_FEATURES", "screen", "psplash-zap", "",d)}'

DEPENDS = "task-base-extended \
           ${SPLASH} \
           ${ZZAPSPLASH} \
	   zlib iotop ipython \
	   python zile \
	   c2py robovis"

# The following are intentionally left out of the install, as they're
# shipped in robot.zip:
# * c2py
# * robovis
IMAGE_INSTALL = "task-base-extended \
            ${ANGSTROM_EXTRA_INSTALL} \
            ${SPLASH} \
            ${ZZAPSPLASH} \
	    zlib iotop ipython \
	    python python-modules zile \
	    opencv-apps kernel-module-uvcvideo"

export IMAGE_BASENAME = "sr-image"
IMAGE_LINGUAS = ""

inherit image
