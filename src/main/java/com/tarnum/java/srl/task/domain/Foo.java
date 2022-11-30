package com.tarnum.java.srl.task.domain;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author imran
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Foo {
	private long id;
	private String name;
}
