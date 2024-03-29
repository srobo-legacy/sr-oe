#
# bootmisc.sh	Miscellaneous things to be done during bootup.
#

. /etc/default/rcS

#
# Set pseudo-terminal access permissions.
#
if ( ! grep -q devfs /proc/mounts ) && test -c /dev/ttyp0
then
	chmod 666 /dev/tty[p-za-e][0-9a-f]
	chown root:tty /dev/tty[p-za-e][0-9a-f]
fi

#
# Apply /proc settings if defined
#
SYSCTL_CONF="/etc/sysctl.conf"
if [ -f "${SYSCTL_CONF}" ]
then
	if [ -x "/sbin/sysctl" ]
	then
		/sbin/sysctl -p "${SYSCTL_CONF}"
	else
		echo "To have ${SYSCTL_CONF} applied during boot, install package <procps>."
	fi
fi

#
# Update /etc/motd.
#
if test "$EDITMOTD" != no
then
	uname -a > /etc/motd.tmp
	sed 1d /etc/motd >> /etc/motd.tmp
	mv /etc/motd.tmp /etc/motd
fi

# Don't try to run ldconfig -- this is a read-only FS, it won't help.
#if [ -e /etc/ld.so.conf ] ; then
# /sbin/ldconfig
#fi

# Set the system clock from hardware clock
if test -e /etc/timestamp
then
    date `cat /etc/timestamp`
fi
: exit 0
