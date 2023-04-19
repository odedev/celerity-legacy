package dev.odes.celerity.core.metadata.domain.repository;

import dev.odes.celerity.core.metadata.domain.entity.View;
import dev.odes.celerity.core.metadata.domain.persistence.ViewPersistence;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * package: dev.odes.celerity.core.metadata.domain.repository
 * class: ViewRepository
 * date: 2023/4/19 0:01
 * version: 1.0.0
 * description:
 */
@Repository
public class ViewRepository {
  private final ViewPersistence viewPersistence;

  public ViewRepository(ViewPersistence viewPersistence) {
    this.viewPersistence = viewPersistence;
  }

  public View findOne() {
    View view = this.viewPersistence.findOne();
    return view;
  }
  public List<View> findMany() {
    List<View> views = this.viewPersistence.findMany();
    return views;
  }
  public View findOneById(String id) {
    View view = this.viewPersistence.findOneById(id);
    return view;
  }
}
