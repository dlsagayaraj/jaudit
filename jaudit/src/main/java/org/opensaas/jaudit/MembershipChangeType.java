/**
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE
 * You may obtain a copy of the License at
 *
 *   http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.opensaas.jaudit;

/**
 * The different types of membership change events.
 * 
 * @see MembershipChangeAuditEvent
 * 
 */
public enum MembershipChangeType {

    /**
     * An entity is being added to a membership.
     */
    ADDED,

    /**
     * An entity is being removed from a membership.
     */
    REMOVED

}
