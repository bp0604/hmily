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

package org.dromara.hmily.tac.common.database.type;

import java.util.Collection;
import java.util.Collections;
import org.dromara.hmily.spi.HmilySPI;
import org.dromara.hmily.tac.common.constants.DatabaseConstant;
import org.dromara.hmily.tac.common.database.metadata.H2DataSourceMetaData;

/**
 * Database type of H2.
 */
@HmilySPI(DatabaseConstant.H2)
public final class H2DatabaseType implements DatabaseType {
    
    @Override
    public String getName() {
        return DatabaseConstant.H2;
    }
    
    @Override
    public Collection<String> getJdbcUrlPrefixes() {
        return Collections.singleton(String.format("jdbc:%s:", getName().toLowerCase()));
    }
    
    @Override
    public H2DataSourceMetaData getDataSourceMetaData(final String url, final String username) {
        return new H2DataSourceMetaData(url);
    }
}
