/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_725LobTest extends org.jooq.impl.TableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = -969649845;

	/**
	 * The singleton instance of <code>t_725_lob_test</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.cubrid.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * The column <code>t_725_lob_test.id</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_725_LOB_TEST, "");

	/**
	 * The column <code>t_725_lob_test.lob</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("lob", org.jooq.impl.SQLDataType.BLOB, T_725_LOB_TEST, "");

	/**
	 * No further instances allowed
	 */
	private T_725LobTest() {
		this("t_725_lob_test", null);
	}

	private T_725LobTest(java.lang.String alias, org.jooq.Table<org.jooq.test.cubrid.generatedclasses.tables.records.T_725LobTestRecord> aliased) {
		this(alias, aliased, null);
	}

	private T_725LobTest(java.lang.String alias, org.jooq.Table<org.jooq.test.cubrid.generatedclasses.tables.records.T_725LobTestRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.cubrid.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.T_725LobTestRecord> getPrimaryKey() {
		return org.jooq.test.cubrid.generatedclasses.Keys.T_725_LOB_TEST__PK_T_725_LOB_TEST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.cubrid.generatedclasses.Keys.T_725_LOB_TEST__PK_T_725_LOB_TEST);
	}
}