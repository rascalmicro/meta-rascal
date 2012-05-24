DESCRIPTION = "Python HTTP Requests for Humans"
HOMEPAGE = "http://python-requests.org"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://setup.py;beginline=68;endline=68;md5=b9f356aab0c61d46e21a96b41409681c"
SRCNAME = "requests"
PR = "r0"

S = "${WORKDIR}/git"

SRCREV = "0.12.1"
SRC_URI = "git://github.com/kennethreitz/requests.git;protocol=git;branch=master"

inherit distutils

RDEPENDS_${PN} = "\
  python-core \
"