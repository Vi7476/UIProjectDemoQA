package utils;

import com.codeborne.selenide.files.DownloadedFile;
import com.codeborne.selenide.files.FileFilter;

import java.io.File;

public class FilterControl {
    FileFilter fileFilter = new FileFilter() {
        @Override
        public boolean match(DownloadedFile downloadedFile) {
            return false;
        }

        @Override
        public boolean notMatch(File file) {
            return FileFilter.super.notMatch(file);
        }

        @Override
        public boolean isEmpty() {
            return FileFilter.super.isEmpty();
        }

        @Override
        public boolean match(File file) {
            return false;
        }

        @Override
        public String description() {
            return null;
        }
    };
}
