/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.today.api.purchase.request;

        import java.util.Optional;
        import com.github.dapeng.org.apache.thrift.TException;
        import com.github.dapeng.org.apache.thrift.protocol.TCompactProtocol;
        import com.github.dapeng.util.TCommonTransport;

        /**
         * Autogenerated by Dapeng-Code-Generator (2.1.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

        *

盘点信息查询请求参数
                          账表日开始时间
                            账表日结束时间
                            转闭店类型

        **/
        public class InventoryTransOutQueryRequest{
        
            /**
            *

开始时间

            **/
            public String startDate ;
            public String getStartDate(){ return this.startDate; }
            public void setStartDate(String startDate){ this.startDate = startDate; }

            public String startDate(){ return this.startDate; }
            public InventoryTransOutQueryRequest startDate(String startDate){ this.startDate = startDate; return this; }
          
            /**
            *

结束时间

            **/
            public String endDate ;
            public String getEndDate(){ return this.endDate; }
            public void setEndDate(String endDate){ this.endDate = endDate; }

            public String endDate(){ return this.endDate; }
            public InventoryTransOutQueryRequest endDate(String endDate){ this.endDate = endDate; return this; }
          
            /**
            *

转闭店类型

            **/
            public Optional<com.today.api.stock.enums.InventoryResultInventoryTypeEnum> inventoryResultInventoryTypeEnum = Optional.empty();
            public Optional<com.today.api.stock.enums.InventoryResultInventoryTypeEnum> getInventoryResultInventoryTypeEnum(){ return this.inventoryResultInventoryTypeEnum; }
            public void setInventoryResultInventoryTypeEnum(Optional<com.today.api.stock.enums.InventoryResultInventoryTypeEnum> inventoryResultInventoryTypeEnum){ this.inventoryResultInventoryTypeEnum = inventoryResultInventoryTypeEnum; }

            public Optional<com.today.api.stock.enums.InventoryResultInventoryTypeEnum> inventoryResultInventoryTypeEnum(){ return this.inventoryResultInventoryTypeEnum; }
            public InventoryTransOutQueryRequest inventoryResultInventoryTypeEnum(Optional<com.today.api.stock.enums.InventoryResultInventoryTypeEnum> inventoryResultInventoryTypeEnum){ this.inventoryResultInventoryTypeEnum = inventoryResultInventoryTypeEnum; return this; }
          

        public static byte[] getBytesFromBean(InventoryTransOutQueryRequest bean) throws TException {
          byte[] bytes = new byte[]{};
          TCommonTransport transport = new TCommonTransport(bytes, TCommonTransport.Type.Write);
          TCompactProtocol protocol = new TCompactProtocol(transport);

          new com.today.api.purchase.request.serializer.InventoryTransOutQueryRequestSerializer().write(bean, protocol);
          transport.flush();
          return transport.getByteBuf();
        }

        public static InventoryTransOutQueryRequest getBeanFromBytes(byte[] bytes) throws TException {
          TCommonTransport transport = new TCommonTransport(bytes, TCommonTransport.Type.Read);
          TCompactProtocol protocol = new TCompactProtocol(transport);
          return new com.today.api.purchase.request.serializer.InventoryTransOutQueryRequestSerializer().read(protocol);
        }

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
            stringBuilder.append("\"").append("startDate").append("\":\"").append(this.startDate).append("\",");
    stringBuilder.append("\"").append("endDate").append("\":\"").append(this.endDate).append("\",");
    stringBuilder.append("\"").append("inventoryResultInventoryTypeEnum").append("\":").append(this.inventoryResultInventoryTypeEnum.isPresent()?this.inventoryResultInventoryTypeEnum.get():null).append(",");
    
            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      