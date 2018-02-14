<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">

    <xsl:template match="/">
        <html>
            <head>
                <style type="text/css">
                    table.tfmt {
                    border: 1px ;
                    }

                    td.colfmt {
                    border: 1px ;
                    background-color: yellow;
                    color: red;
                    text-align:right;
                    }

                    th {
                    background-color: #2E9AFE;
                    color: white;
                    }

                </style>
            </head>
            <body>
                <table class="tfmt">
                    <tr>
                        <th style="width:250px">Name</th>
                        <th style="width:350px">analog</th>
                        <th style="width:250px">certificate id</th>
                        <th style="width:250px">issue_date</th>
                        <th style="width:250px">end_date</th>
                        <th style="width:250px">organization</th>
                        <th style="width:250px">package_type</th>
                        <th style="width:250px">quantity</th>
                        <th style="width:250px">price</th>
                        <th style="width:250px">dose</th>
                        <th style="width:250px">period</th>

                    </tr>

                    <xsl:for-each select="medicines/medicine">
                        <tr>
                            <td class="colfmt">
                                <xsl:value-of select="@medicineNo"/>
                            </td>
                            <td class="colfmt">
                                <xsl:value-of select="name"/>
                            </td>
                            <td class="colfmt">
                                <xsl:value-of select="analog"/>
                            </td>
                            <td class="colfmt">
                                <xsl:value-of select="id"/>
                            </td>
                            <td class="colfmt">
                                <xsl:value-of select="issue_date"/>
                            </td>
                            <td class="colfmt">
                                <xsl:value-of select="end_date"/>
                            </td>
                            <td class="colfmt">
                                <xsl:value-of select="organization"/>
                            </td>
                            <td>
                                <xsl:value-of select="type"/>
                            </td>
                            <td class="colfmt">
                                <xsl:value-of select="quantity"/>
                            </td>
                            <td class="colfmt">
                                <xsl:value-of select="price"/>
                            </td>
                            <td class="colfmt">
                                <xsl:value-of select="dose"/>
                            </td>
                            <td class="colfmt">
                                <xsl:value-of select="period"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>