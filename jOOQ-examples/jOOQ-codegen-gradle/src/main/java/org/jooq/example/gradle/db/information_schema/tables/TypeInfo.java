/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TypeInfo extends org.jooq.impl.TableImpl<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord> {

	private static final long serialVersionUID = -1552123808;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.TYPE_INFO</code>
	 */
	public static final org.jooq.example.gradle.db.information_schema.tables.TypeInfo TYPE_INFO = new org.jooq.example.gradle.db.information_schema.tables.TypeInfo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord> getRecordType() {
		return org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.TYPE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.DATA_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.Integer> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.PRECISION</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.Integer> PRECISION = createField("PRECISION", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.PREFIX</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.String> PREFIX = createField("PREFIX", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.SUFFIX</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.String> SUFFIX = createField("SUFFIX", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.PARAMS</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.String> PARAMS = createField("PARAMS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.AUTO_INCREMENT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.Boolean> AUTO_INCREMENT = createField("AUTO_INCREMENT", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.MINIMUM_SCALE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.Short> MINIMUM_SCALE = createField("MINIMUM_SCALE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.MAXIMUM_SCALE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.Short> MAXIMUM_SCALE = createField("MAXIMUM_SCALE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.RADIX</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.Integer> RADIX = createField("RADIX", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.POS</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.Integer> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.CASE_SENSITIVE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.Boolean> CASE_SENSITIVE = createField("CASE_SENSITIVE", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.NULLABLE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.Short> NULLABLE = createField("NULLABLE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TYPE_INFO.SEARCHABLE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord, java.lang.Short> SEARCHABLE = createField("SEARCHABLE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.TYPE_INFO</code> table reference
	 */
	public TypeInfo() {
		this("TYPE_INFO", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.TYPE_INFO</code> table reference
	 */
	public TypeInfo(java.lang.String alias) {
		this(alias, org.jooq.example.gradle.db.information_schema.tables.TypeInfo.TYPE_INFO);
	}

	private TypeInfo(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord> aliased) {
		this(alias, aliased, null);
	}

	private TypeInfo(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.example.gradle.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.example.gradle.db.information_schema.tables.TypeInfo as(java.lang.String alias) {
		return new org.jooq.example.gradle.db.information_schema.tables.TypeInfo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.example.gradle.db.information_schema.tables.TypeInfo rename(java.lang.String name) {
		return new org.jooq.example.gradle.db.information_schema.tables.TypeInfo(name, null);
	}
}
