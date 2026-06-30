package com.zepeda.proyecto.nested;

public class AppConfig {
    private String appName;
    private String version;
    private Settings settings;

    public AppConfig(String appName, String version, Settings settings) {
        this.appName = appName;
        this.version = version;
        this.settings = settings;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    static class Settings {
        private String theme;
        private boolean notification;
        private String language;

        public Settings(String theme, boolean notification, String language) {
            this.theme = theme;
            this.notification = notification;
            this.language = language;
        }

        public String getTheme() {
            return theme;
        }

        public void setTheme(String theme) {
            this.theme = theme;
        }

        public boolean isNotification() {
            return notification;
        }

        public void setNotification(boolean notification) {
            this.notification = notification;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }
    }
}
