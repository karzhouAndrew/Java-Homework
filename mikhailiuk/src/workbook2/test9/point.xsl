<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <html>
            <body>
                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="/pointsList">
        <table border="1">
            <xsl:apply-templates/>
        </table>
    </xsl:template>
    <xsl:template match="/pointsList/point">
        <tr>
            <xsl:apply-templates/>
        </tr>
    </xsl:template>
    <xsl:template match="/pointsList/point/x">
        <td>
            <xsl:value-of select="text()"/>
            <xsl:value-of select="//point/@unit"/>
        </td>
    </xsl:template>
    <xsl:template match="/pointsList/point/y">
        <td>
            <xsl:value-of select="text()"/>
            <xsl:value-of select="//point/@unit"/>
        </td>
    </xsl:template>
</xsl:stylesheet>