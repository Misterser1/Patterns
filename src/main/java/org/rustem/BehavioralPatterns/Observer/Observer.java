package org.rustem.BehavioralPatterns.Observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> cars);
}
