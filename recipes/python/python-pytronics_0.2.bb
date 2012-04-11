DESCRIPTION = "Hardware control library for the Rascal, a small computer for art and science"
HOMEPAGE = "http://rascalmicro.com"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://setup.py;beginline=7;endline=7;md5=c9902fd2fffc7a69230abe2ddedab49f"
SRCNAME = "pytronics"
PR = "r0"

S = "${WORKDIR}/git"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/rascalmicro/pytronics.git;protocol=git;branch=master"

inherit distutils

RDEPENDS_${PN} = "\
  python-core \
"
