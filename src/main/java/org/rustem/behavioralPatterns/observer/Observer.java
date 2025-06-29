package org.rustem.behavioralPatterns.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> cars);
}
