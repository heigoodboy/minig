/* ***** BEGIN LICENSE BLOCK *****
 * Version: GPL 2.0
 *
 * The contents of this file are subject to the GNU General Public
 * License Version 2 or later (the "GPL").
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Initial Developer of the Original Code is
 *   MiniG.org project members
 *
 * ***** END LICENSE BLOCK ***** */

package fr.aliasource.webmail.server;

import java.util.Map;

import fr.aliasource.webmail.client.rpc.SettingManager;

/**
 * 
 * @author adrien
 * 
 */
public class SettingManagerImpl extends SecureAjaxCall implements
		SettingManager {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7061380742129320665L;

	@Override
	public Map<String, String> saveSignature(Map<String, String> identities) {
		getAccount().getSettingManager().saveSignature(identities);
		return getAccount().updateServerSettings();
	}

}