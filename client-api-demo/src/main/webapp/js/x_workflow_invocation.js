/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

$(document).ready(function(){

    $('[name="invokeWorkflow"]').click(function(){

        var workflow = '&lt;xwf:workflow xwf:version=&quot;0.5&quot; xmlns:xwf=&quot;http://airavata.apache.org/xbaya/xwf&quot;&gt; \
            &lt;xgr:graph xgr:version=&quot;0.5&quot; xgr:type=&quot;ws&quot; xmlns:xgr=&quot;http://airavata.apache.org/xbaya/graph&quot;&gt; \
            &lt;xgr:id&gt;Workflow1&lt;/xgr:id&gt;  \
        &lt;xgr:name&gt;Workflow1&lt;/xgr:name&gt;  \
        &lt;xgr:description&gt;&lt;/xgr:description&gt; \
        &lt;xgr:metadata&gt; \
        &lt;appinfo xmlns=&quot;http://www.w3.org/2001/XMLSchema&quot;&gt; \
             \
            &lt;/appinfo&gt; \
            &lt;/xgr:metadata&gt; \
        &lt;xgr:node xgr:type=&quot;ws&quot;&gt; \
        &lt;xgr:id&gt;LocalEcho_invoke&lt;/xgr:id&gt; \
        &lt;xgr:name&gt;LocalEcho:invoke&lt;/xgr:name&gt; \
        &lt;xgr:outputPort&gt;LocalEcho_invoke_out_0&lt;/xgr:outputPort&gt; \
        &lt;xgr:inputPort&gt;LocalEcho_invoke_in_0&lt;/xgr:inputPort&gt; \
        &lt;xgr:controlInPort&gt;LocalEcho_invoke_ctrl_in_0&lt;/xgr:controlInPort&gt; \
        &lt;xgr:controlOutPort&gt;LocalEcho_invoke_ctrl_out_0&lt;/xgr:controlOutPort&gt; \
        &lt;xgr:x&gt;225&lt;/xgr:x&gt; \
        &lt;xgr:y&gt;106&lt;/xgr:y&gt; \
        &lt;xgr:wsdl&gt;LocalEcho&lt;/xgr:wsdl&gt; \
        &lt;xgr:portType&gt;{http://schemas.airavata.apache.org/gfac/type}LocalEcho&lt;/xgr:portType&gt; \
        &lt;xgr:operation&gt;invoke&lt;/xgr:operation&gt; \
            &lt;/xgr:node&gt; \
        &lt;xgr:node xgr:type=&quot;input&quot;&gt; \
        &lt;xgr:id&gt;echo_input&lt;/xgr:id&gt; \
        &lt;xgr:name&gt;echo_input&lt;/xgr:name&gt; \
        &lt;xgr:outputPort&gt;Input_out_2&lt;/xgr:outputPort&gt; \
        &lt;xgr:x&gt;83&lt;/xgr:x&gt; \
        &lt;xgr:y&gt;57&lt;/xgr:y&gt; \
        &lt;xgr:config&gt; \
        &lt;xgr:description&gt;&lt;/xgr:description&gt; \
        &lt;xgr:dataType&gt;{http://schemas.airavata.apache.org/gfac/type}StringParameterType&lt;/xgr:dataType&gt; \
        &lt;xgr:value&gt;echo_output=Hi&lt;/xgr:value&gt; \
            &lt;xgr:visibility&gt;true&lt;/xgr:visibility&gt; \
            &lt;/xgr:config&gt; \
            &lt;/xgr:node&gt; \
        &lt;xgr:node xgr:type=&quot;output&quot;&gt; \
        &lt;xgr:id&gt;echo_output&lt;/xgr:id&gt; \
        &lt;xgr:name&gt;echo_output&lt;/xgr:name&gt; \
        &lt;xgr:inputPort&gt;Output_in_2&lt;/xgr:inputPort&gt; \
        &lt;xgr:x&gt;440&lt;/xgr:x&gt; \
        &lt;xgr:y&gt;68&lt;/xgr:y&gt; \
        &lt;xgr:config&gt; \
        &lt;xgr:description&gt;&lt;/xgr:description&gt; \
        &lt;xgr:dataType&gt;{http://schemas.airavata.apache.org/gfac/type}StringParameterType&lt;/xgr:dataType&gt; \
            &lt;/xgr:config&gt; \
            &lt;/xgr:node&gt; \
        &lt;xgr:port xgr:type=&quot;ws&quot;&gt; \
        &lt;xgr:id&gt;LocalEcho_invoke_in_0&lt;/xgr:id&gt; \
        &lt;xgr:name&gt;echo_input&lt;/xgr:name&gt; \
        &lt;xgr:node&gt;LocalEcho_invoke&lt;/xgr:node&gt; \
            &lt;/xgr:port&gt; \
        &lt;xgr:port xgr:type=&quot;ws&quot;&gt; \
        &lt;xgr:id&gt;LocalEcho_invoke_out_0&lt;/xgr:id&gt; \
        &lt;xgr:name&gt;echo_output&lt;/xgr:name&gt; \
        &lt;xgr:node&gt;LocalEcho_invoke&lt;/xgr:node&gt; \
            &lt;/xgr:port&gt; \
        &lt;xgr:port xgr:type=&quot;control&quot;&gt; \
        &lt;xgr:id&gt;LocalEcho_invoke_ctrl_in_0&lt;/xgr:id&gt; \
        &lt;xgr:name&gt;control&lt;/xgr:name&gt; \
        &lt;xgr:node&gt;LocalEcho_invoke&lt;/xgr:node&gt; \
            &lt;/xgr:port&gt; \
        &lt;xgr:port xgr:type=&quot;control&quot;&gt; \
        &lt;xgr:id&gt;LocalEcho_invoke_ctrl_out_0&lt;/xgr:id&gt; \
        &lt;xgr:name&gt;control&lt;/xgr:name&gt; \
        &lt;xgr:node&gt;LocalEcho_invoke&lt;/xgr:node&gt; \
            &lt;/xgr:port&gt; \
        &lt;xgr:port xgr:type=&quot;systemData&quot;&gt; \
        &lt;xgr:id&gt;Input_out_2&lt;/xgr:id&gt; \
        &lt;xgr:name&gt;Parameter&lt;/xgr:name&gt; \
        &lt;xgr:node&gt;echo_input&lt;/xgr:node&gt; \
            &lt;/xgr:port&gt; \
        &lt;xgr:port xgr:type=&quot;systemData&quot;&gt; \
        &lt;xgr:id&gt;Output_in_2&lt;/xgr:id&gt; \
        &lt;xgr:name&gt;Parameter&lt;/xgr:name&gt; \
        &lt;xgr:node&gt;echo_output&lt;/xgr:node&gt; \
            &lt;/xgr:port&gt; \
        &lt;xgr:edge xgr:type=&quot;data&quot;&gt; \
        &lt;xgr:fromPort&gt;LocalEcho_invoke_out_0&lt;/xgr:fromPort&gt; \
        &lt;xgr:toPort&gt;Output_in_2&lt;/xgr:toPort&gt; \
            &lt;/xgr:edge&gt; \
        &lt;xgr:edge xgr:type=&quot;data&quot;&gt; \
        &lt;xgr:fromPort&gt;Input_out_2&lt;/xgr:fromPort&gt; \
        &lt;xgr:toPort&gt;LocalEcho_invoke_in_0&lt;/xgr:toPort&gt; \
            &lt;/xgr:edge&gt; \
            &lt;/xgr:graph&gt; \
        &lt;xwf:wsdls&gt; \
        &lt;xwf:wsdl xwf:id=&quot;LocalEcho&quot;&gt;&amp;lt;wsdl:definitions name=&quot;LocalEcho&quot; targetNamespace=&quot;http://schemas.airavata.apache.org/gfac/type&quot; \
            xmlns:typens=&quot;http://schemas.airavata.apache.org/gfac/type/LocalEcho/xsd&quot; xmlns:wsa=&quot;http://www.w3.org/2005/08/addressing&quot; xmlns:xsd=&quot;http://www.w3.org/2001/XMLSchema&quot; \
            xmlns:globalTypens=&quot;http://schemas.airavata.apache.org/gfac/type/xsd&quot; \
            xmlns:wsdlns=&quot;http://schemas.airavata.apache.org/gfac/type&quot; xmlns:soap=&quot;http://schemas.xmlsoap.org/wsdl/soap/&quot; \
            xmlns:gfac=&quot;http://schemas.airavata.apache.org/gfac/type&quot; xmlns:wsdl=&quot;http://schemas.xmlsoap.org/wsdl/&quot;&gt; \
            &amp;lt;wsdl:types&gt; \
        &amp;lt;schema elementFormDefault=&quot;unqualified&quot; targetNamespace=&quot;http://schemas.airavata.apache.org/gfac/type/LocalEcho/xsd&quot; xmlns=&quot;http://www.w3.org/2001/XMLSchema&quot;&gt; \
            &amp;lt;import namespace=&quot;http://schemas.airavata.apache.org/gfac/type&quot; schemaLocation=&quot;http://people.apache.org/~lahiru/GFacParameterTypes.xsd&quot; /&gt; \
            &amp;lt;element name=&quot;invoke_InputParams&quot; type=&quot;typens:invoke_InputParamsType&quot; /&gt; \
        &amp;lt;complexType name=&quot;invoke_InputParamsType&quot;&gt; \
        &amp;lt;sequence&gt; \
        &amp;lt;element name=&quot;echo_input&quot; type=&quot;gfac:StringParameterType&quot;&gt; \
        &amp;lt;annotation&gt; \
        &amp;lt;documentation /&gt; \
        &amp;lt;/annotation&gt; \
        &amp;lt;/element&gt; \
        &amp;lt;/sequence&gt; \
        &amp;lt;/complexType&gt; \
        &amp;lt;element name=&quot;invoke_OutputParams&quot; type=&quot;typens:invoke_OutputParamsType&quot; /&gt; \
        &amp;lt;complexType name=&quot;invoke_OutputParamsType&quot;&gt; \
        &amp;lt;sequence&gt; \
        &amp;lt;element name=&quot;echo_output&quot; type=&quot;gfac:StringParameterType&quot;&gt; \
        &amp;lt;annotation&gt; \
        &amp;lt;documentation /&gt; \
        &amp;lt;/annotation&gt; \
        &amp;lt;/element&gt; \
        &amp;lt;/sequence&gt; \
        &amp;lt;/complexType&gt; \
        &amp;lt;/schema&gt; \
        &amp;lt;/wsdl:types&gt; \
        &amp;lt;wsdl:message name=&quot;invoke_ResponseMessage_59b968d2-4272-49ad-aa1d-f4f0a86feaec&quot;&gt; \
        &amp;lt;wsdl:part name=&quot;parameters&quot; element=&quot;typens:invoke_OutputParams&quot;&gt; \
        &amp;lt;/wsdl:part&gt; \
        &amp;lt;/wsdl:message&gt; \
        &amp;lt;wsdl:message name=&quot;invoke_RequestMessage_b0abb23d-17a3-468f-b84d-22580ed0b5dc&quot;&gt; \
        &amp;lt;wsdl:part name=&quot;parameters&quot; element=&quot;typens:invoke_InputParams&quot;&gt; \
        &amp;lt;/wsdl:part&gt; \
        &amp;lt;/wsdl:message&gt; \
        &amp;lt;wsdl:portType name=&quot;LocalEcho&quot;&gt; \
        &amp;lt;wsdl:documentation /&gt; \
        &amp;lt;wsdl:operation name=&quot;invoke&quot;&gt; \
        &amp;lt;wsdl:documentation /&gt; \
        &amp;lt;wsdl:input name=&quot;invoke_RequestMessage_b0abb23d-17a3-468f-b84d-22580ed0b5dc&quot; message=&quot;wsdlns:invoke_RequestMessage_b0abb23d-17a3-468f-b84d-22580ed0b5dc&quot;&gt; \
        &amp;lt;/wsdl:input&gt; \
        &amp;lt;wsdl:output name=&quot;invoke_ResponseMessage_59b968d2-4272-49ad-aa1d-f4f0a86feaec&quot; message=&quot;wsdlns:invoke_ResponseMessage_59b968d2-4272-49ad-aa1d-f4f0a86feaec&quot;&gt; \
        &amp;lt;/wsdl:output&gt; \
        &amp;lt;/wsdl:operation&gt; \
        &amp;lt;/wsdl:portType&gt; \
        &amp;lt;/wsdl:definitions&gt;&lt;/xwf:wsdl&gt; \
            &lt;/xwf:wsdls&gt; \
        &lt;xwf:image&gt;iVBORw0KGgoAAAANSUhEUgAAAjMAAACeCAYAAADHT4vbAAAvlklEQVR42u2dCXzU1dX388guD/ra \
        VkUeVMRaW7H1tdqn7Vvf1ld93epS22Jr3euKtbgiFKkbEtawiCjIHpA9gOyLJBDCvgUIBAxhDRAI \
        W1iMEMJ5zu/O3PFmmJnMTGaSifxyPt8P+c9kZpJw5///5pxz703auXOrEEIIIYTUVJL4SyCEEEII \
        ZYYQQgghhDJDCCGEEEKZIYQQQghlhhBCCCGEMkMIIYQQQpkhhBBCCKHMEEIIIYQyQwghhBBCmSGE \
        EEIIocwQQgghhFBmCCGEEEKZIYQQQgihzBBCCCGEUGYIIYQQQpnhL4IQQgghlBlCCCGEEMoMIYQQ \
        QghlhhBCCCGUGUIIIYQQygwhhBBCCGWGEEIIIYQyQwghhBDKDCGEEEIIZYYQQgghhDJDCCGEEEKZ \
        IYQQQghlhhBCCCGEMkMIIYQQQpkhhBBCCGWGEEIIIYQyQwghhBBCmSGEEEIIocwQQgghhDJDCCGE \
        EEKZIYQQQgihzBBCCCGEUGYIIYQQQpkhhBBCCKHMEEIIIYRQZgghhBBCKDOEEEIIocwQQgghhFBm \
        CCGEEEIoM4QQQgihzBBCCCGEUGYIIYQQQigzhBBCCCGUGUIIIYRQZgghhBBCKDOEEEIIIZQZQggh \
        hBDKDCGEEEIoM4QQQgghlBlCCCGEEMoMIYQQQghlJm7s2iEzZs6UXr17y3vvvUeqmI6du8mAoSMl \
        J2ctxyIhhFBmSKTk5m6Unj17Snp6huzZu09OnRY5qXxTKlKifH1K5IRy/KTIMeXoNyLFypESkcPK \
        oa9FDioHTogUKfuPi+xTCo+J7FX2HBXZ7WVXsYcdRzxsO+xh6yGRfGXLQZE85asDIpuVTUUiucrG \
            /SIblJx9IuuVdYUia5XsvSJrlNV7RFYpK3eLrFCWF3hYusvD4p0eFilZO0QWKpnbRRYo87eJZCjp \
        W0XmKV/mi8xV5mwRma3MyhOZqcz4SmS6Mm2zyFRlyiaRL5TJuSKTlIkbRdKUCRtExivjcjyMWe9h \
        1DoPI9d6GKGkZosMVwZmHZTe4xZKpy7dZNGiTI5LQgihzJBwKSjYaURm2/YdUlomhpNxkpkCr8js \
        9IrM9sPfyky+V2byvDKzOQYys8wrM0t2lReZLK/IZHpFJp4yM9YrM6O9MvO5IzMQGTBsjYchq0X6 \
        Z+yVzio0zNAQQghlhoTJzJkzJT0jQ057RcZmZUCJV2ZOeGXmWJxkJlhWBuR6ZWaDV2bWx0BmgmVl \
        0r0i86VXZOZ4RSYeMuNmZSAyQ70yA3qPnCmpqcM5PgkhhDJDwqF3796yt3DfWTITLCsDir0yc9gr \
        MwfjJDPBsjJgrVdm1nhlZlUMZCZYVmaWV2RmeEVmmldk4iEzg5GdWbBfunbtyvFJCCGUGRIOaD4t \
        OyNhy0ywrAwo8srMPq/M7I2TzATLysRLZoJlZaZ4RWayV2QmekWmsjIzaJWY/5cpUyZLdvZKjlNC \
        CKHMkKqQmWBZGeDf/JuUlGTYHofmX2Cf3zb/xktmgmVlJoRo/o1EZlJThxkyMzM4VgkhhDJDKpKZ \
        0jjJTKCsjJWNYM2/lZ3J5C8zdiaTf/NvPGTGvnagrMyoEM2/oWQGMENDCCGUGRJCZmxWxp3J5N/8 \
        Gy+Z8c/KuDOZ/Jt/c+LQ/Ds/QPNvvGQmWFZmmNP8C5EJJDMoOXG8EkIIZYZUIDPBsjLuTCbb/Jvc \
        vZdc/cNrpF69etL4sibyTscuZ8lMn/7D5PobbpTaderIZU2aSkq/IeVkxoL7r/lxCxkzI6tcVua1 \
        t5PlsqZXmPsv1ce/0j45YPNvqMwMZOas16tdR676UQv5eHyWLyvj/zV16taTux9+VqZvKvU1/9r7 \
        XJmxt03cePZzgGj6ZQYGkJkRI1I5XgkhhDJDopUZ/6xMx87dzYX6iaeflaLjZUZkcPxB5xRf829y \
        j77mtrt+/6Bs2l0s+ftK5KVX25aTmcf+3kry9pdK6qS55vjyZs19MvO6igxue/7V9iYr88JrHcxx \
        axUaNysTaCZTMJl56PFWMj+/VHqO9LxekyuanyUzf372DZOV+ds/PK/3t5ff8WVl7Ne4zb+uzESb \
        mQlHZgDHKyGEUGZIjGTmiiubmQt27tY9psRUWFxqjq+8qrlPZq5UMcFtqzYVlGv+dWVm/c5iX5kJ \
        x7Vq1fLJTOMmTT1C8tUhIzNLtxSb40svaxqy+RclpmAyM3tDsa/MhOPz9PX8ZWbS6kNGZiZle17v \
        +5c0KSczyNi4JSZXZtD468qMbf6lzBBCIqVg13aZOXOGWT6DW74kNj2SP5SJqQMiXuyUMlPNMhOo \
        nGJlxJaY7G1uv4zdxsDtmcl3ZAZYmbHHbvOvLUlV1C/jygz6Zeyx2zNjb/OXGbdfxpakwpGZND+Z \
        GRtiGwPb/EuZIYQEwm4xk5GeLvv26omuVE/Ip055OKkn42++8VBSoidq/YvyxAkPx497OKYn4aN6 \
        8i0u9nDkiIfDetI9pCfcgwc9HNCTbVGRh/16ot23z0OhnmTxunv2eNitJ9eCAg+79MS6c6eHHXpC \
        3b7dwzY9mW7Vk2l+voctWzzk5Yl8pSfQzZs9bNKTZ26uh4164tywwUOOnjTX6wlz3ToPa9d6yNYT \
        5Ro9Sa5e7WGVniBXrvSwYoWe9JeLLFvmYelSD0uW6Ml/sciiRR6ysvTkv9BDZqbIggUe5s8XycjQ \
        i0C6h3nzPHz5pcjcuXoxmONh9myRWbM8zJwpMmOGh+nTRaZNk4NpabJw4EBJ6dIpou1oKDMxlplg \
        zb8VZWZ2FBYHbf61mZkVG3eetb6MveDbrIwrM7b595LGTczx8vzisDMz/jKzJIDM2JlM9jbb/GuP \
        v1hbXC4z84PGTcvJDLI5VmbGrDpWocwEy8qkhmj+pcwQcg5nZLxbzOyAHJw+7SEWMgORcWUGIhNI \
        ZiAy4cgMRKYimYHIhCMzEJlAMgORcWUGIhMrmYHIBJIZiIwrMxCZQDIDkfHKjGHqVNk7Zoz06No5 \
        7AwNZSYOMuOflQm0jYFt/u3So4+5YD/+1LOy98hJ2X+sTCbNTJe77r3fJzOdvD0z99z/kGzYcUi2 \
        7CuRVq+2DSgzmMnkygyaf1968x1z/OLrHYzMPPdK+4A9M5HIjDuTKZjMtHyujZGZv7byvN4jL3Xw \
        yUzjyz2C1nHIXJm8sUzufPj5s2SmXoOG5vizBYVRlZjAZyspM4Scq2CLmQxcYMvKQssMRCaQzEBk \
        XJlxszLBZAYiE47MQGQCyQxExpUZNyvjygxEJlYyA5EJJDMQGVdmIDKxkhmITCCZUZExTJkiC4b1 \
        C3s7GspMFchMsKyM3cbg4wFD5Pqf3mBKS3Xr1TMiM3FGerlp2R99lmpmM+FrLr60sfToNyRsmcGU \
        bIiMzdBgNpMVmYq2MYhUZuZtDTzjCbOZpuaW+rYx6DY6S674YQuTnfH/eiszz3boJw0aNvLdHk2/ \
            DGWGkHMX9Mjsg0xYmYHIxEpmIDLhyAxEJlYyA5EJJDMQGVdmIDKBZAYiE47MuFmZYDIDkQlHZiAy \
        4ciMk5WxMnNw/Jiwt6OhzFSjzARbXybQNga7q2gbA9v8W5ltDKx8RLK+TDy2MRjIMhMh5/w52YhM \
        IJmByLgyA5EJJDMQmXBkxi0xBZMZiEw4MgORCUdm3KxMMJnx75cJJjMQmUAyA5FxZcbNyrgyA5GJ \
        lcyoyBi++CLs7WgoM3FoAI7Xyr/uTKYdXpnZFieZgcgs94qMu/JvvGQm2OaSldnGgDJDCM/JZ8mM \
        m5UJJjP+/TLBZCZA8689/wVt/nVlxm3+razMRNP8W1mZ8W/+tTITqvnXlRm/5t9gMhPOdjSUmRi/ \
            cc6c8bxvTsV5GwM3KxNoG4PNEchM3br1AuKflQm0jYFd+deVGcxSArGQmWBZmVDbGJgGYM5mIoTn \
        5IpkJg4zmSqUmeqYyeTfL6P4vs84zWTyPX8EM5nKyYyKjL/MhNqOhjIT4zfO1/qGOK5vgmP6Jjiq \
        b4JifQMc0cF/WAf/IR38B3XgH9CBX6SDfv/+/Tre9+l4L9TxvlfH+W4d4wU6xnfp8+3U8b1Dx/Z2 \
        HdvbdGxv1XGdr2N6i47pPB3TX+l43qzjOFfH8UYdwxt0DOfoGF6v43edjt+1+p+erWN3jY7b1Srg \
        q3TMrtQxu0LH7HIdp0t1nC7RcbpYx+giHaNZOj4X6vjM1LG5QMfmfNM4l64Dc54OzC/VsOfqoJyj \
        A3K2DshZOhjRXDdDB+J0HYjTdBBO0QH4hQ6+yZMny6RJk2TixImSlpYmEyZMkPHjx8u4ceNk7Nix \
        MmbMGBk9erSMGjVKRo4cKSNGjNBBmirDhw+XYcOGydChQ2XIkCEyePBgGTRokAwcOFA+++wzGTBg \
        gPTv318+/fRT6devn3z88cfSt29f+eijj6RPnz6mPt6rVy8zeyElJUV69Ogh3bt3p8wQcq7LTDQz \
        mfz7ZcKcyeS7iCf4TKYKZca/XybCmUxnyUwEM5lCyUyw7WgoMzF+45zQN0JFMhNIZPboQA8mMxAZ \
        SMx3EUgZZAsyFEhmAonMJ598UqHMWJHp1q0bZYYQykxEM5l6de0q11x9tdlipslll0mX998/aybT \
        MD0H3fizn0mdOnWkaZMmMkTPQ+iVOWs7F72/xbXXShYuzk6JKbltW7niv/5L6tSuLU31NZLfeivs \
        mUzJr78uV+hjzGMbN5bkV18tJzM+kXBkxnebk5VxsTLjf3s9/f6fvf9+KYW4eGXG9xhHZny3qcwE \
        fP4IZzIZmdE/jMPdjoYyE0eZiSQrY2XmXBIZf5AJCicr48pMRVkZygwhlJlIZjJ1T/Zs//Lsk09K \
        mZ7DITI4TunUySczfVV2cNuD99wjxSofJXrubtu6dTmZafXUU1Kq5/O5Y8ea4+ZXXumTGYgMbmv/ \
            8ssmK9Phn/80x8lt2lQ4kwkiYx77wgsmK9PhxRc9j4XQeLMyFclMucyM30wme/sbf/ubycx00J8D \
        x+88/XTYMlNhZiaMmUzBZCbY+ZsyE+M3TrglpnCyMigvnSsiY0GpKpDMRJKVsTIDkcG0PsoMIZSZ \
        cGcyNVPpwEV4DwRCz+Oleu42MtKsmU9m8DluK4A8+M1kshfxYjzeO5PJrupuZQaZGNx2COUgPdcX \
        b9hgjpFlqaj5F19jHotykMpMsUqIeeyll5aTmXp165Zr/g0pM07zr739EARk8WIpnuvdf+8HP/CV \
        mGzGxu2XiVhmwmj+pcwkkMxEkpVxZQZZGdsjkyhAHr7//e+bARqv10BvT7hZGSszobIylBlCKDOR \
        zGQKtcWMlRnfhTrAtOxyPTPefhnfbV6Z8R07PTOmJFW7dmiZ2bz528c6/TK+x8ZQZtyZTL7nD0dm \
        vDOZfMeVmMlEmanGN06kjb+hemWikQFkNX7yk59IXR3Il19+uXTp0iVmonHJJZeY5l97HA+pQQ9N \
        MJnxFxn8rsaNHUuZIYQEl5kIm39tZqYYDbtBZjLZzMxOlHEikRlv82+TSy/1vAYad5GZ8fa5+DIz \
        IWYyNdHzsHksJCREZqbWeef5ROaYV0hCyoy3+deXWcK0amRmVETM8+vrujJjnt8rM8dUSsKSmQhn \
        MlFmElBmIsnKRCszmD0E4cAsIRxjptITTzwRM9GIZ0bGJdysTKmeiEr0d71JTygjU1MDigxkjjJD \
        CGUmXJnpo+cP2zNzUs/bZXoOT9cL7f133+1r/rU9Mw/9/vdySM9ZJXr+9u+ZCSUz77z6qjlGrwxk \
        pv0//vFtz0wFM5ne8X5th1atjMy0f96zFUzyK6/4ZKZ506aezX71/Fmm8vL8n/707ffgXV+mYYMG \
        5rgQkhFAZto8+qiRmfZ6DTGvp78PKzPNm3hWk5+r59yy9HR5/r77ysuMilDD+vU9z69/cEY7k4ky \
        U41vnEinY0Nmgk3HjlQC7tY3Gy7owe7H9O1HdYA20EEM8Dluc2Wlc+fO0kQHau3ateW6664zs4zs \
        fS7+coMp4n/SNwwyQihFtWvXLmr5qUhmbHkJInNMf6eH9fdXpG/81ZmZMlwfS5khhIQlM0G2MRii \
        55sbfvpTU1rCjCaITDoutM607FT9mhu9X9NY/4gc0qdPeDLjXfm3g8qPzdCY2Uyhmn/99mSCyNgM \
        DTIyvuZfr8xkDR8uLa6+2mRPzppV5JWZfm3bSqPzz//2dj+Z8c3G0muBbzaTV2ay9Dzc4qqrAj+/ \
        V2b66c9X7vmjmMlEmUlQmYkkKxONzDRs2NBIRbD7n3vuObnjjjvM+jPgzjvvNLe5MvPAAw+Y9WhQ \
        7mnfvr3ccMMNQTMz7vELL7xgng9r3OC5IVaVlZmKemVckSnUn7tAX3e7/oWxWN8Yg/RrITKQM8oM \
        Iee4zMRzT6ZwtjGoQXsyndUzU9GeTLHcxoAyk1gyE+l0bCsz/ovkxboMdPHFF5sF8ewxPkcWxX28 \
        m6mB0CBDE47M4Lmx+J49xufRykw4JSbMYAokMlv0zbZJ30w5+kaZO3KkfNKzJ2WGkHO9ATjR9mSK \
        5TYGMd6TyScz8dyTKczmX8pMNb5xwikxhZOViUZmKsrMBJKLULLif1somanosdHKTKjp2KFEJnvS \
        JMlITZWBvXqZ/5fHH39cnnzySZNBatWqlbRs+Wdp3fpl6dq1s4wdO8rs+bF1ax7HMSHfNZnx7TET \
        3z2ZfCITgz2ZMBMpEFWxJxNmKZmZStW5JxNnMyWWzEQ6HdtdKC+aadko84TqmUH2BFsWhMrMRCsz   \
            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 \
        &lt;/xwf:image&gt; \
        &lt;/xwf:workflow&gt;';


        var url = 'http://localhost:7080/axis2/services/WorkflowInterpretor';
//        var url = 'http://localhost:6060/axis2/services/WorkflowInterpretor';
        var name1 = 'echo_input';
        var value1 = 'echo_output=Hello';
        var message = '&lt;?xml version=&#39;1.0&#39; encoding=&#39;UTF-8&#39;?&gt;<launchWorkflow><workflowAsString>' + workflow + '</workflowAsString><inputs><name>' + name1 + '</name><value>' + value1 + '</value></inputs><launchWorkflow>';

        $.ajax({
//            beforeSend: function(x) {
//                x.setRequestHeader(
//                    "SOAPAction",
//                    "urn:launchWorkflow"
//                );
//            },
            type: "POST",
            data : message,
//            dataType: "xml",
            contentType: "application/xml; charset=\"utf-8\"",
            url: url
        }).done(function(msg) {
         alert( "Data Saved: " + JSON.stringify(msg));
         });
    });
});