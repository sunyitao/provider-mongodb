/**
 * Copyright 2012 CaneData.org
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
package org.canedata.provider.mongodb.test.expr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.canedata.entity.Entity;
import org.canedata.provider.mongodb.test.AbilityProvider;
import org.junit.Test;

/**
 * 
 * @author Sun Yat-ton
 * @version 1.00.000 2012-2-25
 */
public class TestNotEmpty extends AbilityProvider {
	@Test
	public void notEmpty(){
		Entity e = factory.get("user");
		assertNotNull(e);
		
		int c = e.filter(e.expr().isNotEmpty("4up")).count().intValue();
		assertEquals(c, 1L);
	}
	
	@Test
	public void notEmpty2(){
		Entity e = factory.get("user");
		assertNotNull(e);
		
		int c = e.filter(e.expr().isNotEmpty("4up")).count().intValue();
		assertEquals(c, 1L);
	}
	
	@Test
	public void notEmpty3(){
		Entity e = factory.get("user");
		assertNotNull(e);
		
		int c = e.filter(e.expr().isNotEmpty("up4up")).count().intValue();
		assertEquals(c, 0L);
	}
}
