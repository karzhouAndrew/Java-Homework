<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/points">
        <html>
            <body>
                <h2 align="center">Points</h2>
                <table align="center" border="1">
                    <tr bgcolor="#33CCFF">
                        <th>x</th>
                        <th>y</th>
                    </tr>
                    <xsl:apply-templates/>
                </table>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="point">
        <tr>
            <td><xsl:value-of select="x"/><xsl:value-of select="@unit"/></td>
            <td><xsl:value-of select="y"/><xsl:value-of select="@unit"/></td>
        </tr>
    </xsl:template>

</xsl:stylesheet>