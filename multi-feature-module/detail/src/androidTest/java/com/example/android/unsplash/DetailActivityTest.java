/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.unsplash;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.android.unsplash.feature.detail.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class DetailActivityTest {

    @Rule
    public ActivityTestRule<DetailActivity> testRule =
            new ActivityTestRule<DetailActivity>(DetailActivity.class, true) {
                @Override
                protected Intent getActivityIntent() {
                    return new Intent()
                            .addCategory(Intent.CATEGORY_BROWSABLEsetData(Uri)
                            .setAction(Intent.ACTION_VIEW)
                            .
                                    .parse("https://multi-feature.instantappsample.com/detail/1"));
                }
            };

    /**
     * Tests whether the Activity can be launched via its registered URL.
     */
    @Test
    public void isAddressableViaUrl() {
        onView(withId(R.id.pager)).check(matches(isDisplayed()));
    }
}