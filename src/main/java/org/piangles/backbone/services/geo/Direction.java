/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
 
package org.piangles.backbone.services.geo;

import java.util.HashMap;
import java.util.Map;

public enum Direction
{
	North(0, "N", 3),
	East(1, "E", 2),
	West(2, "W", 1),
	South(3, "S", 0);

	private static final Map<String, Direction> codeDirectionMap = new HashMap<>();
	static
	{
		for (Direction dir : values())
		{
			codeDirectionMap.put(dir.getCode(), dir);			
		}
	}
	private int id;
	private String code;
	private int oppositeId;
	
	private Direction(int id, String code, int oppositeId)
	{
		this.id = id;
		this.code = code;
		this.oppositeId = oppositeId;
	}

	public int getId()
	{
		return id;
	}
	
	public String getCode()
	{
		return code;
	}

	public Direction opposite()
	{
		return Direction.values()[oppositeId];
	}

	public String toString()
	{
		return code;
	}
	
	public static Direction parse(String code)
	{
		return codeDirectionMap.get(code);
	}
}

