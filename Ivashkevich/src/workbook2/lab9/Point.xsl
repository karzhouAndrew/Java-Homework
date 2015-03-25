<?xml version="1.0"?>
<xs:stylesheet xmlns:xs="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xs:output method="html"/>
    <xs:template match="/pointsList">
        <table border="1">
            <tr bgcolor="#ff5566">
                <td align="center">
                    <strong>Height</strong>
                </td>
                <td align="center">
                    <strong>Width</strong>
                </td>
                <td align="center">
                    <strong>Unit</strong>
                </td>
            </tr>
            <xs:apply-templates/>
        </table>
    </xs:template>
    <xs:template match="/pointsList/point">
        <tr  bgcolor="#00ff00">
            <xs:apply-templates/>
            <td>
                <xs:value-of select="@unit"/>
            </td>
        </tr>
    </xs:template>
    <xs:template match="/pointsList/point/x">
        <td>
            <xs:value-of select="text()"/>

        </td>
    </xs:template>
    <xs:template match="/pointsList/point/y">
        <td>
            <xs:value-of select="text()"/>
        </td>
    </xs:template>
</xs:stylesheet>
