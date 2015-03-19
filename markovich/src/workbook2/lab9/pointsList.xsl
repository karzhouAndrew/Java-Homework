<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2 align="center">Points</h2>
                <table align="center" border="1">
                    <tr bgcolor="#33CCFF">
                        <th>x</th>
                        <th>y</th>
                    </tr>
                    <xsl:for-each select="points/point">
                        <tr>
                            <td>
                                <xsl:value-of select="x"/><xsl:value-of select="//point/@unit"/>
                            </td>
                            <td>
                                <xsl:value-of select="y"/><xsl:value-of select="//point/@unit"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>