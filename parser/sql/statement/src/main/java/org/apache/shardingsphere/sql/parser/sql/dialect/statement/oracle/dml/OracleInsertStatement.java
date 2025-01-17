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

package org.apache.shardingsphere.sql.parser.sql.dialect.statement.oracle.dml;

import lombok.Setter;
import org.apache.shardingsphere.sql.parser.sql.common.segment.dml.predicate.WhereSegment;
import org.apache.shardingsphere.sql.parser.sql.common.segment.generic.InsertMultiTableElementSegment;
import org.apache.shardingsphere.sql.parser.sql.common.statement.dml.InsertStatement;
import org.apache.shardingsphere.sql.parser.sql.dialect.statement.oracle.OracleStatement;

import java.util.Optional;

/**
 * Oracle insert statement.
 */
@Setter
public final class OracleInsertStatement extends InsertStatement implements OracleStatement {
    
    private InsertMultiTableElementSegment insertMultiTableElementSegment;
    
    private WhereSegment where;
    
    /**
     * Get insert multi table element segment.
     *
     * @return insert select segment
     */
    public Optional<InsertMultiTableElementSegment> getInsertMultiTableElementSegment() {
        return Optional.ofNullable(insertMultiTableElementSegment);
    }
    
    /**
     * Get where segment.
     *
     * @return where segment
     */
    public Optional<WhereSegment> getWhere() {
        return Optional.ofNullable(where);
    }
}
