# Copyright (C) 2013 Timesys Corporation
# Released under the MIT license (see COPYING.MIT for the terms)
include linux-imx.inc

# Revision of 3.0.15_vybrid branch
SRC_URI = "git://github.com/Timesys/linux-timesys.git \
	   file://defconfig"

SRC_URI_append_twr-vf65gs10 = " \
           file://0001-mvf_fec.c-Fix-mac-address-read-to-match-fuse-layout-.patch \
           file://0002-mvf.c-Change-console-device-name-to-match-mainline-u.patch \
"

SRCREV_twr-vf65gs10 = "9b479b468bda7b6f71f9480971391b323eea2a1a"
SRCREV_pcl052 = "4225cb2038b7187b4b1cab6570b7e9c526aa72a3"
SRCREV_pcm052 = "e929d4f864d138124741feb58399ed2182f7ad49"
LOCALVERSION = "-3.0-mvf+yocto"

COMPATIBLE_MACHINE = "(vf60)"
