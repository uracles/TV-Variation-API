package com.merakool.tv_variations.repository;

import com.merakool.tv_variations.entity.TvProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvProviderRepository extends JpaRepository<TvProvider, Long> {


}
