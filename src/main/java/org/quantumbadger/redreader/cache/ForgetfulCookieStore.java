/*******************************************************************************
 * This file is part of RedReader.
 *
 * RedReader is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RedReader is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RedReader.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package org.quantumbadger.redreader.cache;

import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class ForgetfulCookieStore implements CookieStore {

	public static final ForgetfulCookieStore INSTANCE = new ForgetfulCookieStore();

	private ForgetfulCookieStore() {}

	@Override
	public synchronized void addCookie(final Cookie cookie) {}

	@Override
	public List<Cookie> getCookies() {
		return new ArrayList<Cookie>(0);
	}

	@Override
	public boolean clearExpired(final Date date) {
		return false;
	}

	@Override
	public void clear() {}
}
