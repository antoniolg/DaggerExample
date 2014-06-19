/*
 *
 *  *
 *  *  * Copyright (C) 2014 Antonio Leiva Gordillo.
 *  *  *
 *  *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  *  * you may not use this file except in compliance with the License.
 *  *  * You may obtain a copy of the License at
 *  *  *
 *  *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *  *
 *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  * See the License for the specific language governing permissions and
 *  *  * limitations under the License.
 *  *
 *
 */

package com.antonioleiva.daggerexample.app.ui.login;

import com.antonioleiva.daggerexample.app.AppModule;
import com.antonioleiva.daggerexample.app.interactors.LoginInteractor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = LoginActivity.class,
        addsTo = AppModule.class
)
public class LoginModule {

    private LoginView view;

    public LoginModule(LoginView view) {
        this.view = view;
    }

    @Provides @Singleton public LoginView provideView() {
        return view;
    }

    @Provides @Singleton
    public LoginPresenter providePresenter(LoginView loginView, LoginInteractor loginInteractor) {
        return new LoginPresenterImpl(loginView, loginInteractor);
    }
}
