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
package com.today.api.stock.enums;

        /**
         * Autogenerated by Dapeng-Code-Generator (2.2.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

        * 

 来源类型=单据类型
 编码规则: 初始流水: 0, 销售 1 -> 9, 采购: 10 -> 39, 其他: 40 -> 49

 采购单据来源包括 10:进货单(stock);11:进货拒收修正单(rejection_correct_for_stock);12:进货缺货修正单(absence_correct_for_stock);20:退货单(refund);21:退货拒收修正单(rejection_correct_for_refund);22:退货缺货修正单(absence_correct_for_refund);30:调拨单(transfer)'
 销售单据来源包括 销售单, 销退单

        **/
        public enum StockJournalSourceTypeEnum2 implements com.github.dapeng.org.apache.thrift.TEnum{
        
            /**
            *

 销售单

            **/
            STORE_ORDER(1),
          
            /**
            *

 销退单

            **/
            SALE_RETURN(2),
          
            /**
            *

 进货单

            **/
            STOCK(10),
          
            /**
            *

 进货拒收修正单

            **/
            REJECTION_CORRECT_FOR_STOCK(11),
          
            /**
            *

 进货缺货修正单

            **/
            ABSENCE_CORRECT_FOR_STOCK(12),
          
            /**
            *

 采购退货单

            **/
            REFUND(20),
          
            /**
            *

 退货拒收修正单

            **/
            REJECTION_CORRECT_FOR_REFUND(21),
          
            /**
            *

 退货缺货修正单

            **/
            ABSENCE_CORRECT_FOR_REFUND(22),
          
            /**
            *

 调拨单

            **/
            TRANSFER(30),
          
            /**
            *

 报废单

            **/
            SCRAP_ORDER(40),
          
            /**
            *

 盘点

            **/
            INVENTORY(41),
          
            /**
            *

 库存初始化

            **/
            INIT(0),
          
            /**
            *

 调整

            **/
            ADJUST(50),
          
        /*
        * 未定义的枚举类型
        */
        UNDEFINED(-1);
        private final int value;

        private StockJournalSourceTypeEnum2(int value){
          this.value = value;
        }

        public int getValue(){
          return this.value;
        }

        public static StockJournalSourceTypeEnum2 findByValue(int value){
          switch(value){
            
                case 1:
                return STORE_ORDER;
              
                case 2:
                return SALE_RETURN;
              
                case 10:
                return STOCK;
              
                case 11:
                return REJECTION_CORRECT_FOR_STOCK;
              
                case 12:
                return ABSENCE_CORRECT_FOR_STOCK;
              
                case 20:
                return REFUND;
              
                case 21:
                return REJECTION_CORRECT_FOR_REFUND;
              
                case 22:
                return ABSENCE_CORRECT_FOR_REFUND;
              
                case 30:
                return TRANSFER;
              
                case 40:
                return SCRAP_ORDER;
              
                case 41:
                return INVENTORY;
              
                case 0:
                return INIT;
              
                case 50:
                return ADJUST;
              
            case -1:
              return UNDEFINED;
            default:
            return null;
          }
        }
      }
      