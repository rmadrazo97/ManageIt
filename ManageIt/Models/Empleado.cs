//------------------------------------------------------------------------------
// <auto-generated>
//     Este código se generó a partir de una plantilla.
//
//     Los cambios manuales en este archivo pueden causar un comportamiento inesperado de la aplicación.
//     Los cambios manuales en este archivo se sobrescribirán si se regenera el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace ManageIt.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class Empleado
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public Empleado()
        {
            this.PuntoDeVenta = new HashSet<PuntoDeVenta>();
            this.Usuario = new HashSet<Usuario>();
        }
    
        public int idEmpleado { get; set; }
        public string nombre { get; set; }
        public string documento { get; set; }
        public string nodocto { get; set; }
        public string email { get; set; }
        public Nullable<decimal> comision { get; set; }
        public string telefonocelular { get; set; }
        public string telefonoresidencia { get; set; }
        public string telefonoextra { get; set; }
        public string direccion { get; set; }
        public Nullable<System.DateTime> fechanacimiento { get; set; }
        public int idTipo { get; set; }
    
        public virtual TipoEmpleado TipoEmpleado { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<PuntoDeVenta> PuntoDeVenta { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<Usuario> Usuario { get; set; }
    }
}
