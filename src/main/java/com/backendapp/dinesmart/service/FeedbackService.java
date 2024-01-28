package com.backendapp.dinesmart.service;

import java.util.List;

import com.backendapp.dinesmart.Entities.Feedback;

public interface FeedbackService {
    Feedback addFeedback(Feedback feedback);
    void deleteFeedback(int feedbackId);
    Feedback updateFeedback(Feedback feedback);
    Feedback getFeedbackById(int feedbackId);
    List<Feedback> getAllFeedbacks();
}
