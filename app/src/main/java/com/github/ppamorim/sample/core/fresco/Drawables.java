  /*
  * This file provided by Facebook is for non-commercial testing and evaluation
  * purposes only. Facebook reserves all rights not expressly granted.
  *
  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
  * FACEBOOK BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
  * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
  * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
  */

package com.github.ppamorim.sample.core.fresco;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.github.ppamorim.sample.R;

  public class Drawables {

  public static void init(final Resources resources) {
    if (sPlaceholderDrawable == null) {
      sPlaceholderDrawable = resources.getDrawable(R.color.ripple_material_dark);
    }
    if (sErrorDrawable == null) {
      sErrorDrawable = resources.getDrawable(R.color.ripple_material_dark);
    }
  }

  public static Drawable sPlaceholderDrawable;
  public static Drawable sErrorDrawable;
  private Drawables() {}

}