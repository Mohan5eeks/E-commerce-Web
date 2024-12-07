package com.product.catalog.dao.rating;

import com.product.catalog.entity.db.Rating;

import java.util.List;

public interface RatingDao {
    List<Rating> getProductRatingsByProductId(Integer productId);
    Rating getRatingByRatingId(Integer ratingId);
    Rating createRating(Rating rating);
    Rating updateRating(Integer ratingId, Rating rating);
    String deleteRating(Integer ratingId);
}
