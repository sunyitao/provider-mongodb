/**
 * Copyright 2011 Jlue.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.canedata.provider.mongodb.test.spring;

import static org.junit.Assert.*;

import org.canedata.entity.Entity;
import org.canedata.provider.mongodb.entity.MongoEntityFactory;
import org.junit.Test;

/**
 * 
 * @author Sun Yat-ton (Mail:ImSunYitao@gmail.com)
 * @version 1.00.000 2011-8-18
 */
public class TestSpringIntegration {
	@Test
	public void getFactory(){
		MongoEntityFactory factory = (MongoEntityFactory)Context.getContext().getBean("entityFactory");
		assertNotNull(factory);
		
		Entity e = factory.get("user");
		assertNotNull(e);
		
		assertTrue(e.count().intValue() > 0);
	}
}
