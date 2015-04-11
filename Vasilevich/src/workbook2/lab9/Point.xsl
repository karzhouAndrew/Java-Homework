<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/pointlist">
        <table border="1">
            <xsl:apply-templates/>
        </table>
    </xsl:template>
    <xsl:template match="/pointlist/point">
        <tr>
            <xsl:apply-templates/>
            <td><xsl:value-of select="@unit"/></td>
        </tr>
    </xsl:template>
    <xsl:template match="/pointlist/point/x">
        <td><xsl:value-of select="text()"/></td>
    </xsl:template>
    <xsl:template match="/pointlist/point/y">
        <td><xsl:value-of select="text()"/></td>
    </xsl:template>

</xsl:stylesheet>