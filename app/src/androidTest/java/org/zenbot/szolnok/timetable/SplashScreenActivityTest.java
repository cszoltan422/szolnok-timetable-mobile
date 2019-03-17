package org.zenbot.szolnok.timetable;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class SplashScreenActivityTest {

    @Rule
    public ActivityTestRule<SplashScreenActivity> activityRule = new ActivityTestRule<>(SplashScreenActivity.class);

    @Test
    public void splashScreenShouldAppearWithBackgroundImageThenDissapear() throws InterruptedException {
        onView(withId(R.id.splash_screen_activity_image_view)).check(matches(isDisplayed()));
        Thread.sleep(1500);
        onView(withId(R.id.splash_screen_activity_image_view)).check(doesNotExist());
    }
}
