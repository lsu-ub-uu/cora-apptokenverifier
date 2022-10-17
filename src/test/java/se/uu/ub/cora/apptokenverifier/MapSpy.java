/*
 * Copyright 2022 Olov McKie
 *
 * This file is part of Cora.
 *
 *     Cora is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Cora is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Cora.  If not, see <http://www.gnu.org/licenses/>.
 */
package se.uu.ub.cora.apptokenverifier;

import java.util.HashMap;

import se.uu.ub.cora.testutils.mcr.MethodCallRecorder;

public class MapSpy<K, V> extends HashMap<K, V> {
	public MethodCallRecorder MCR = new MethodCallRecorder();

	@Override
	public V get(Object key) {
		MCR.addCall("key", key);
		return super.get(key);
	}

}
