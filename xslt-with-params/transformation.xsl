<?xml version="1.0" encoding="iso-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:param name="myParam"/>
    <xsl:template match="/rentalProperties">
        <output>
            <price><xsl:value-of select="property/price"/></price>
            <parameter><xsl:value-of select="$myParam"/></parameter>
        </output>    
    </xsl:template>
</xsl:stylesheet>